package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DAO.CustomerDAO;
import DAO.OrderDAO;
import DAO.ProductDAO;
import VO.CustomerVO;
import VO.OrderVO;
import VO.ProductVO;

/*
 * 날짜 : 2024/07/31
 * 이름 : 최준혁
 * 내용 : Shop 미니 프로젝트 실습하기
 */
public class ShopMain {
	public static void main(String[] args) {

		System.out.println("----------------------------------");
		System.out.println("쇼핑몰에 오신것을 환영합니다.");
		System.out.println("----------------------------------");


		Scanner sc = new Scanner(System.in);
		CustomerDAO dao = CustomerDAO.getInstance();
		ProductDAO pdao = ProductDAO.getInstance();
		OrderDAO odao = OrderDAO.getInstance();

		//로그인 사용자 객체
		CustomerVO loginvo = null;
		// 상품목록 리스트
		List<ProductVO> vos = new ArrayList<ProductVO>();
		while(true) {

			if(loginvo == null) {
				System.out.println("종료:0, 로그인:1, 회원가입:2, 상품목록:3, 주문하기:4");

			}
			else {
				System.out.println("종료:0, 로그아웃:1, 주문현황:2, 상품목록:3, 주문하기:4");
			}

			System.out.print("선택>");

			int answer = sc.nextInt();

			if(answer == 0) {
				break;
			} else if (answer == 1) {

				if(loginvo == null) {
					// 로그인
					System.out.print("아이디 입력 :");
					String custId = sc.next();

					loginvo = dao.selectCustomer(custId);

					if(loginvo != null) {
						System.out.println(loginvo.getName()+"님 어서오세요.");
					} else {
						System.out.println("일치하는 회원이 없습니다.");
						System.out.println(loginvo.toString());
					}
				}
				else {
					System.out.println(loginvo.getName()+"님 안녕히 가세요.");
					loginvo = null;
				}

			} else if (answer == 2) {
				if(loginvo == null) {
					CustomerVO vo = new CustomerVO();
					// 회원가입
					System.out.print("아이디 입력: ");
					vo.setCustId(sc.next());

					System.out.print("이름 입력: ");
					vo.setName(sc.next());

					System.out.print("휴대폰 입력: ");
					vo.setHp(sc.next());

					System.out.print("주소 입력: ");
					vo.setAddr(sc.next());


					int result = dao.insertCustomer(vo);

					if(result >0) {
						System.out.println("회원가입을 축하합니다");
					} else {
						System.out.println("회원가입에 실패하셨습니다");
					}
				}else {
					// 주문현황(상품번호, 상품명, 주문수량, 주문자이름, 주문일자)-> (내꺼!)
					List<OrderVO> vo = odao.showOrder(loginvo.getCustId());
					System.out.println("----------- 주문목록 ------------");
					for(OrderVO order : vo) {
						System.out.print(order.getOrderNo() + ", ");
						System.out.print(order.getOrderProduct() + ", ");
						System.out.print(order.getProName() + ", ");
						System.out.print(order.getOrderCount() + ", ");
						System.out.print(order.getOrderer() + ", ");
						System.out.println(order.getOrderDate());
					}
					System.out.println("-------------------------------");
				}

			} else if (answer == 3) {


				vos = pdao.selectProducts();
				System.out.println("----------------상품 목록----------------");
				vos.stream().forEach(System.out::println);
				System.out.println("---------------------------------------");

				//	for(ProductVO vo : vos) {
				//		System.out.println(vo.toString());
				//	}

			} else if (answer == 4) {
				// 주문하기

				if(loginvo == null) {
					System.out.println("로그인을 먼저 하십시오.");
					continue;
				} else {
					vos = pdao.selectProducts();
					System.out.println("----------------상품 목록----------------");
					vos.stream().forEach(System.out::println);
					System.out.println("---------------------------------------");

					System.out.print("주문할 상품 번호 입력:");
					int orderProduct = sc.nextInt();

					System.out.print("주문할 상품 수량 입력:");
					int orderCount = sc.nextInt();

					OrderVO vo = new OrderVO(loginvo.getCustId(), orderProduct, orderCount);
					int result = odao.InsertOrder(vo);

					if(result == 0) {
						System.out.println("주문이 실패되었습니다");
					} else {
						System.out.println("주문이 완료되었습니다");
					}
				}

			}


		}

		sc.close();
		System.out.println("안녕히 가십시오.");
	}
}
