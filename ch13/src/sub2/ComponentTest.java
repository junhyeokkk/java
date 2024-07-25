package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;
import javax.swing.JTable;

public class ComponentTest {

	private JFrame frame;
	private final JLabel lblNewLabel = new JLabel("컴포넌트 실습");
	private JTextField txtUid;
	private JTextField txtName;
	private JTextField txtHp;
	private JTextField txtplus_1;
	private JTextField txtplus_2;
	private JTextField txtplusResult;
	private JTextField txtminus_1;
	private JTextField txtminus_2;
	private JTextField txtminusResult;
	private JTextField txtmul_1;
	private JTextField txtmul_2;
	private JTextField txtmulResult;
	private JTextField txtdiv_1;
	private JTextField txtdiv_2;
	private JTextField txtdivResult;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentTest window = new ComponentTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ComponentTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 905);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		lblNewLabel.setBounds(12, 0, 76, 31);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("버튼 실습");
		lblNewLabel_1.setBounds(12, 29, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);

		JButton btn1 = new JButton("확인1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("확인 1 버튼 클릭...");
			}
		});
		btn1.setBounds(12, 54, 97, 23);
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("확인2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "버튼2 클릭...");
			}
		});
		btn2.setBounds(132, 54, 97, 23);
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("확인3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "버튼3 클릭..","확인대화상자",JOptionPane.YES_NO_OPTION);
				if(answer == 0) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
			}
		});
		btn3.setBounds(249, 54, 97, 23);
		frame.getContentPane().add(btn3);

		JLabel lblNewLabel_1_1 = new JLabel("텍스트필드 실습");
		lblNewLabel_1_1.setBounds(12, 87, 97, 15);
		frame.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_2 = new JLabel("아이디");
		lblNewLabel_2.setBounds(12, 112, 57, 15);
		frame.getContentPane().add(lblNewLabel_2);

		txtUid = new JTextField();
		txtUid.setBounds(88, 109, 116, 21);
		frame.getContentPane().add(txtUid);
		txtUid.setColumns(10);

		JLabel lbResultUid = new JLabel("결과:");
		lbResultUid.setBounds(289, 112, 116, 15);
		frame.getContentPane().add(lbResultUid);

		JButton btnUid = new JButton("확인");
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uid = txtUid.getText();
				lbResultUid.setText("결과: "+uid);
			}
		});
		btnUid.setBounds(216, 108, 57, 23);
		frame.getContentPane().add(btnUid);



		JLabel lblNewLabel_2_1 = new JLabel("이름");
		lblNewLabel_2_1.setBounds(12, 155, 57, 15);
		frame.getContentPane().add(lblNewLabel_2_1);

		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(88, 152, 116, 21);
		frame.getContentPane().add(txtName);

		JLabel lbResultName = new JLabel("결과:");
		lbResultName.setBounds(289, 155, 116, 15);
		frame.getContentPane().add(lbResultName);

		JButton btnName = new JButton("확인");
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				lbResultName.setText("결과: "+name);
			}
		});
		btnName.setBounds(216, 151, 57, 23);
		frame.getContentPane().add(btnName);



		JLabel lblNewLabel_2_2 = new JLabel("휴대폰");
		lblNewLabel_2_2.setBounds(12, 198, 57, 15);
		frame.getContentPane().add(lblNewLabel_2_2);

		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(88, 195, 116, 21);
		frame.getContentPane().add(txtHp);

		JLabel lbReusltHp = new JLabel("결과:");
		lbReusltHp.setBounds(289, 198, 116, 15);
		frame.getContentPane().add(lbReusltHp);

		JButton btnHp = new JButton("확인");
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Hp = txtHp.getText();
				lbReusltHp.setText("결과: "+ Hp);
			}
		});
		btnHp.setBounds(216, 194, 57, 23);
		frame.getContentPane().add(btnHp);

		JLabel lblNewLabel_2_2_1 = new JLabel("덧셈");
		lblNewLabel_2_2_1.setBounds(12, 241, 57, 15);
		frame.getContentPane().add(lblNewLabel_2_2_1);

		txtplus_1 = new JTextField();
		txtplus_1.setColumns(10);
		txtplus_1.setBounds(58, 238, 69, 21);
		frame.getContentPane().add(txtplus_1);

		txtplus_2 = new JTextField();
		txtplus_2.setColumns(10);
		txtplus_2.setBounds(160, 238, 69, 21);
		frame.getContentPane().add(txtplus_2);

		JLabel lblNewLabel_2_2_1_1 = new JLabel("+");
		lblNewLabel_2_2_1_1.setBounds(143, 241, 17, 15);
		frame.getContentPane().add(lblNewLabel_2_2_1_1);

		txtplusResult = new JTextField();
		txtplusResult.setColumns(10);
		txtplusResult.setBounds(277, 238, 69, 21);
		frame.getContentPane().add(txtplusResult);

		JLabel lblNewLabel_2_2_1_1_1 = new JLabel("=");
		lblNewLabel_2_2_1_1_1.setBounds(249, 241, 17, 15);
		frame.getContentPane().add(lblNewLabel_2_2_1_1_1);

		JButton btnPlus = new JButton("확인");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(txtplus_1.getText());
				int num2 = Integer.parseInt(txtplus_2.getText());
				int result = num1 + num2;
				txtplusResult.setText(String.valueOf(result));
			}
		});
		btnPlus.setBounds(365, 237, 57, 23);
		frame.getContentPane().add(btnPlus);

		JLabel lblNewLabel_2_2_1_2 = new JLabel("뺄셈");
		lblNewLabel_2_2_1_2.setBounds(12, 284, 57, 15);
		frame.getContentPane().add(lblNewLabel_2_2_1_2);

		txtminus_1 = new JTextField();
		txtminus_1.setColumns(10);
		txtminus_1.setBounds(58, 281, 69, 21);
		frame.getContentPane().add(txtminus_1);

		JLabel lblNewLabel_2_2_1_1_2 = new JLabel("-");
		lblNewLabel_2_2_1_1_2.setBounds(143, 284, 17, 15);
		frame.getContentPane().add(lblNewLabel_2_2_1_1_2);

		txtminus_2 = new JTextField();
		txtminus_2.setColumns(10);
		txtminus_2.setBounds(160, 281, 69, 21);
		frame.getContentPane().add(txtminus_2);

		JLabel lblNewLabel_2_2_1_1_1_1 = new JLabel("=");
		lblNewLabel_2_2_1_1_1_1.setBounds(249, 284, 17, 15);
		frame.getContentPane().add(lblNewLabel_2_2_1_1_1_1);

		txtminusResult = new JTextField();
		txtminusResult.setColumns(10);
		txtminusResult.setBounds(277, 281, 69, 21);
		frame.getContentPane().add(txtminusResult);

		JButton btnHp_1_1 = new JButton("확인");
		btnHp_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(txtminus_1.getText());
				int num2 = Integer.parseInt(txtminus_2.getText());
				int result = num1 - num2;
				txtminusResult.setText(String.valueOf(result));
			}
		});
		btnHp_1_1.setBounds(365, 280, 57, 23);
		frame.getContentPane().add(btnHp_1_1);

		JLabel lblNewLabel_2_2_1_3 = new JLabel("곱셈");
		lblNewLabel_2_2_1_3.setBounds(12, 332, 57, 15);
		frame.getContentPane().add(lblNewLabel_2_2_1_3);

		txtmul_1 = new JTextField();
		txtmul_1.setColumns(10);
		txtmul_1.setBounds(58, 329, 69, 21);
		frame.getContentPane().add(txtmul_1);

		JLabel lblNewLabel_2_2_1_1_3 = new JLabel("*");
		lblNewLabel_2_2_1_1_3.setBounds(143, 332, 17, 15);
		frame.getContentPane().add(lblNewLabel_2_2_1_1_3);

		txtmul_2 = new JTextField();
		txtmul_2.setColumns(10);
		txtmul_2.setBounds(160, 329, 69, 21);
		frame.getContentPane().add(txtmul_2);

		JLabel lblNewLabel_2_2_1_1_1_2 = new JLabel("=");
		lblNewLabel_2_2_1_1_1_2.setBounds(249, 332, 17, 15);
		frame.getContentPane().add(lblNewLabel_2_2_1_1_1_2);

		txtmulResult = new JTextField();
		txtmulResult.setColumns(10);
		txtmulResult.setBounds(277, 329, 69, 21);
		frame.getContentPane().add(txtmulResult);

		JButton btnmulResult = new JButton("확인");
		btnmulResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(txtmul_1.getText());
				int num2 = Integer.parseInt(txtmul_2.getText());
				int result = num1 * num2;
				txtmulResult.setText(String.valueOf(result));
			}
		});
		btnmulResult.setBounds(365, 328, 57, 23);
		frame.getContentPane().add(btnmulResult);

		JLabel lblNewLabel_2_2_1_4 = new JLabel("나눗셈");
		lblNewLabel_2_2_1_4.setBounds(12, 378, 57, 15);
		frame.getContentPane().add(lblNewLabel_2_2_1_4);

		txtdiv_1 = new JTextField();
		txtdiv_1.setColumns(10);
		txtdiv_1.setBounds(58, 375, 69, 21);
		frame.getContentPane().add(txtdiv_1);

		JLabel lblNewLabel_2_2_1_1_4 = new JLabel("/");
		lblNewLabel_2_2_1_1_4.setBounds(143, 378, 17, 15);
		frame.getContentPane().add(lblNewLabel_2_2_1_1_4);

		txtdiv_2 = new JTextField();
		txtdiv_2.setColumns(10);
		txtdiv_2.setBounds(160, 375, 69, 21);
		frame.getContentPane().add(txtdiv_2);

		JLabel lblNewLabel_2_2_1_1_1_3 = new JLabel("=");
		lblNewLabel_2_2_1_1_1_3.setBounds(249, 378, 17, 15);
		frame.getContentPane().add(lblNewLabel_2_2_1_1_1_3);

		txtdivResult = new JTextField();
		txtdivResult.setColumns(10);
		txtdivResult.setBounds(277, 375, 69, 21);
		frame.getContentPane().add(txtdivResult);

		JButton btndivResult = new JButton("확인");
		btndivResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(txtdiv_1.getText());
				int num2 = Integer.parseInt(txtdiv_2.getText());
				int result = num1 / num2;
				txtdivResult.setText(String.valueOf(result));
			}
		});
		btndivResult.setBounds(365, 374, 57, 23);
		frame.getContentPane().add(btndivResult);

		JLabel lblNewLabel_1_1_1 = new JLabel("체크박스 실습");
		lblNewLabel_1_1_1.setBounds(12, 416, 97, 15);
		frame.getContentPane().add(lblNewLabel_1_1_1);

		JCheckBox chk1 = new JCheckBox("서울");
		chk1.setBounds(12, 442, 57, 23);
		frame.getContentPane().add(chk1);

		JCheckBox chk2 = new JCheckBox("대전");
		chk2.setBounds(73, 442, 57, 23);
		frame.getContentPane().add(chk2);

		JCheckBox chk3 = new JCheckBox("대구");
		chk3.setBounds(132, 442, 57, 23);
		frame.getContentPane().add(chk3);

		JCheckBox chk4 = new JCheckBox("부산");
		chk4.setBounds(194, 442, 57, 23);
		frame.getContentPane().add(chk4);

		JCheckBox chk5 = new JCheckBox("광주");
		chk5.setBounds(249, 442, 57, 23);
		frame.getContentPane().add(chk5);

		JLabel lbResultCheck = new JLabel("결과 :");
		lbResultCheck.setBounds(12, 477, 162, 15);
		frame.getContentPane().add(lbResultCheck);

		JButton btnCheck = new JButton("확인");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<String> cities = new ArrayList<>();

				if(chk1.isSelected()) {
					cities.add(chk1.getText());
				}
				if(chk2.isSelected()) {
					cities.add(chk2.getText());
				}
				if(chk3.isSelected()) {
					cities.add(chk3.getText());
				}
				if(chk4.isSelected()) {
					cities.add(chk4.getText());
				}
				if(chk5.isSelected()) {
					cities.add(chk5.getText());
				}
				lbResultCheck.setText("결과 : " + cities);
			}
		});


		btnCheck.setBounds(314, 442, 57, 23);
		frame.getContentPane().add(btnCheck);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("테이블 실습");
		lblNewLabel_1_1_1_1.setBounds(12, 502, 97, 15);
		frame.getContentPane().add(lblNewLabel_1_1_1_1);

		table = new JTable();
		table.setBounds(12, 531, 359, 283);
		frame.getContentPane().add(table);
		
		//테이블 설정
		String[] columNames = {"아이디","이름","나이","휴대폰"};

		DefaultTableModel model = new DefaultTableModel(columNames,0);
		model.setRowCount(0);

		table.setModel(model);
		
		JButton btnTable = new JButton("출력");
		btnTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<Person> persons = new ArrayList<>();
				persons.add(new Person("a101","김유신",23,"010-1234-1001"));
				persons.add(new Person("a102","김춘추",21,"010-1234-1002"));
				persons.add(new Person("a103","장보고",33,"010-1234-1003"));
				persons.add(new Person("a104","강감찬",43,"010-1234-1004"));
				persons.add(new Person("a105","이순신",53,"010-1234-1005"));
				for(Person person : persons) {
					Object[] rowData = {person.getId(),person.getName(),person.getAge(),person.getHp()};
					model.addRow(rowData);
				}
			}
		});
		btnTable.setBounds(12, 824, 97, 23);
		frame.getContentPane().add(btnTable);






	}
}
