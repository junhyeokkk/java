package user2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User2Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("----------------------------------");
		System.out.println("회원 관리 매니저 v2.0");
		System.out.println("----------------------------------");

		while(true) {
			System.out.println("종료:0, 입력:1, 조회:2, 검색:3, 수정:4, 삭제:5");
			int choose = sc.nextInt();

			if(choose == 0) {
				break;
			} else if (choose == 1) {
				System.out.print("추가할 회원 아이디 입력: ");
				String uid = sc.next();

				System.out.print("추가할 회원 이름 입력: ");
				String name = sc.next();
				
				System.out.print("추가할 회원 생년월일 입력: ");
				String birth = sc.next();
				
				System.out.print("추가할 회원 주소 입력: ");
				String addr = sc.next();
				
				User2VO vo = new User2VO(uid, name, birth, addr);
				
				User2DAO.getInstance().insertUser2(vo);
				
				System.out.println("입력 완료...");
				
			} else if (choose == 2) {
				System.out.print("조회할 회원 아이디 입력 :");
				String seluid = sc.next();
				User2VO vo = new User2VO();
				vo = User2DAO.getInstance().selectUser2(seluid);
				
				System.out.println(vo.toString());
				
			} else if (choose == 3) {
				List<User2VO> vos = new ArrayList<>();
				vos =User2DAO.getInstance().selectUser2s();
				
				for(User2VO vo : vos) {
					System.out.println(vo.toString());
				}
				
			} else if (choose == 4) {
				System.out.print("수정할 회원 아이디를 입력하세요 ");
				String uid = sc.next();

				System.out.print("수정할 회원 이름을 입력하세요 ");
				String name = sc.next();
				
				System.out.print("수정할 회원 생년월일을 입력하세요 ");
				String birth = sc.next();
				
				System.out.print("수정할 회원 주소를 입력하세요 ");
				String addr = sc.next();

				User2VO vo = new User2VO(uid, name, birth, addr);
				int result = User2DAO.getInstance().updateUser2(vo);
				
				if(result == 0) {
					System.out.println("수정할 회원 아이디가 없습니다.");
				}  else {
					System.out.println("수정완료 ...");
				}
				
			} else if (choose == 5) {
				System.out.print("삭제할 회원 아이디를 입력하세요 ");
				String uid = sc.next();
				
				int result = User2DAO.getInstance().delectUser2(uid);
				
				if(result == 0) {
					System.out.println("삭제할 회원 아이디가 없습니다");
				} else {
					System.out.println("삭제완료 ...");
				}
			}
		}

	}
}
