package user1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 날짜 : 2024/07/29	
 * 이름 : 최준혁
 * 내용 : CRUD 실습하기
 */
public class CRUDTest {

	public static void main(String[] args) {

		System.out.println("---------------------------------");
		System.out.println("회원 관리 매니저 v1.0");
		System.out.println("---------------------------------");

		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("종료:0, 입력:1, 조회:2, 검색:3, 수정:4, 삭제:5");
			System.out.print("선택>");

			int answer = sc.nextInt();

			if(answer == 0) {
				break;
			} else if(answer == 1) {
				System.out.print("아이디 입력 : ");
				String uid = sc.next();
				System.out.print("이름 입력 : ");
				String name = sc.next();
				System.out.print("생년월일 입력 : ");
				String birth = sc.next();
				System.out.print("휴대폰 입력 : ");
				String hp = sc.next();
				System.out.print("나이 입력 : ");
				int age = sc.nextInt();
				
				User1VO vo = new User1VO(uid, name, birth, hp, age);
				
				UserDAO dao = UserDAO.getInstance(); 
				dao.insertUser(vo);
				
				System.out.println("입력 완료");
				
			} else if(answer == 2) {
				List<User1VO> vos = new ArrayList<>();
				UserDAO dao = UserDAO.getInstance();
				
				vos = dao.selectUsers();
				
				for(User1VO vo : vos) {
					System.out.println(vo);
				}
				
				
				
			} else if(answer == 3) {
				System.out.print("아이디 입력 :");
				String uid = sc.next();
				
				UserDAO dao = UserDAO.getInstance();
				User1VO vo = dao.selectUser(uid);
				
				System.out.println(vo.toString());

			} else if(answer == 4) {
				
				User1VO user = new User1VO();
				System.out.print("수정 회원 아이디 입력 : ");
				user.setUid(sc.next());
				
				System.out.print("수정 회원 이름 입력 : ");
				user.setName(sc.next());
				
				System.out.print("수정 회원 생년월일 입력 : ");
				user.setBirth(sc.next());
				
				System.out.print("수정 회원 휴대폰 입력 : ");
				user.setHp(sc.next());
				
				System.out.print("수정 회원 나이 입력 : ");
				user.setAge(sc.nextInt());
				
				int result = UserDAO.getInstance().updateUser(user);
				
				if(result > 0) {
					System.out.println("수정완료");
				} else {
					System.out.println("수정할 회원 아이디가 없습니다.");
				}
				
			} else if(answer == 5) {
				System.out.println("삭제 회원 아이디 입력 :");
				String uid = sc.next();
				
				int result = UserDAO.getInstance().deleteUser(uid);
				
				if(result == 0) {
					System.out.println("삭제할 회원 아이디가 없습니다");
				} else {
					System.out.println("삭제 완료");
				}
			}

		}//end while
		sc.close();
		System.out.println("프로그램 종료");
	}
}
