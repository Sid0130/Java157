package com.itwill.project.view;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.itwill.project.controller.PetDao;

public class PetCreateFrame extends JFrame {

	private static final String[] SELECT_TYPE = {
		"강아지", "고양이", "기타"
	};
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel animalPanel;
	private JPanel titlePanel;
	private JPanel buttonPanel;
	private JLabel lblAnimalLabel;
	private JLabel lblAnimalName;
	private JLabel lblAnimalAge;
	private JLabel lblAnimalWeight;
	private JLabel lblAnimalTpye;
	private JLabel lblAnimalGender;
	private JTextField textFieldAnimalName;
	private JTextField textFieldAnimalAge;
	private JTextField textFieldAnimalWeight;
	private JLabel lblAnimalMemo;
	private JScrollPane scrollAnimalPane;
	private JTextField textFieldOwnerName;
	private JTextField textFieldOwnerContact;
	private JTextField textFieldOwnerAdress;
	private JLabel lblOwnerName;
	private JLabel lblOwnerContact;
	private JLabel lblOwnerLabel;
	private JLabel lblOwnerAderss;
	private JPanel OwnerPanel;
	private JTextArea textOwnerArea;
	private JLabel lblAnimalMemo_1;
	private JScrollPane scrollOwnerPane;
	private JTextArea textAnimalArea;
	private JComboBox<String> comboBox;
	private JRadioButton radioBtnfmale;
	private JRadioButton radioBtnMale;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private PetDao petDao;
	private JButton btnSave;
	private JButton btnCancel;
	private Component parentComponent;
	private JLabel lblNewLabel;
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void showPetCreateFrame(Component parentComponent) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PetCreateFrame frame = new PetCreateFrame(parentComponent);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PetCreateFrame(Component parentComponent) {
		petDao = PetDao.INSTANCE;
		this.parentComponent = parentComponent;
		initialize();
		
	}
	
	/**
	 * Create the frame.
	 */
	public void initialize() {
		setTitle("신규 등록");
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 678);
		
		setLocationRelativeTo(parentComponent); // 프레임 위치를 부모 프레임 중간에
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		buttonPanel = new JPanel();
		buttonPanel.setBounds(5, 594, 424, 33);
		contentPane.add(buttonPanel);
		
		btnSave = new JButton("등록");
		buttonPanel.add(btnSave);
		
		btnCancel = new JButton("취소");
		buttonPanel.add(btnCancel);
		
		animalPanel = new JPanel();
		animalPanel.setBounds(5, 56, 424, 259);
		contentPane.add(animalPanel);
		animalPanel.setLayout(null);
		
		lblAnimalLabel = new JLabel("동물 정보 입력");
		lblAnimalLabel.setFont(new Font("굴림", Font.PLAIN, 18));
		lblAnimalLabel.setBounds(12, 10, 143, 25);
		animalPanel.add(lblAnimalLabel);
		
		lblAnimalName = new JLabel("이름");
		lblAnimalName.setFont(new Font("굴림", Font.PLAIN, 15));
		lblAnimalName.setBounds(22, 45, 28, 25);
		animalPanel.add(lblAnimalName);
		
		lblAnimalAge = new JLabel("나이");
		lblAnimalAge.setFont(new Font("굴림", Font.PLAIN, 15));
		lblAnimalAge.setBounds(22, 80, 28, 25);
		animalPanel.add(lblAnimalAge);
		
		lblAnimalWeight = new JLabel("체중");
		lblAnimalWeight.setFont(new Font("굴림", Font.PLAIN, 15));
		lblAnimalWeight.setBounds(22, 115, 28, 25);
		animalPanel.add(lblAnimalWeight);
		
		lblAnimalTpye = new JLabel("분류");
		lblAnimalTpye.setFont(new Font("굴림", Font.PLAIN, 15));
		lblAnimalTpye.setBounds(237, 45, 28, 25);
		animalPanel.add(lblAnimalTpye);
		
		lblAnimalGender = new JLabel("성별");
		lblAnimalGender.setFont(new Font("굴림", Font.PLAIN, 15));
		lblAnimalGender.setBounds(237, 80, 28, 25);
		animalPanel.add(lblAnimalGender);
		
		radioBtnMale = new JRadioButton("남자");
		buttonGroup.add(radioBtnMale);
		radioBtnMale.setSelected(true);
		radioBtnMale.setBounds(285, 80, 49, 23);
		animalPanel.add(radioBtnMale);
		
		radioBtnfmale = new JRadioButton("여자");
		buttonGroup.add(radioBtnfmale);
		radioBtnfmale.setBounds(349, 80, 49, 23);
		animalPanel.add(radioBtnfmale);
		
		comboBox = new JComboBox<>();
		comboBox.setBounds(281, 45, 121, 23);
		DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(SELECT_TYPE);
		comboBox.setModel(comboBoxModel);
		
		animalPanel.add(comboBox);
		
		textFieldAnimalName = new JTextField();
		textFieldAnimalName.setBounds(62, 45, 128, 21);
		animalPanel.add(textFieldAnimalName);
		textFieldAnimalName.setColumns(10);
		
		textFieldAnimalAge = new JTextField();
		textFieldAnimalAge.setColumns(10);
		textFieldAnimalAge.setBounds(62, 80, 128, 21);
		animalPanel.add(textFieldAnimalAge);
		
		textFieldAnimalWeight = new JTextField();
		textFieldAnimalWeight.setColumns(10);
		textFieldAnimalWeight.setBounds(62, 115, 128, 21);
		animalPanel.add(textFieldAnimalWeight);
		
		lblAnimalMemo = new JLabel("비고");
		lblAnimalMemo.setFont(new Font("굴림", Font.PLAIN, 15));
		lblAnimalMemo.setBounds(22, 150, 28, 25);
		animalPanel.add(lblAnimalMemo);
		
		scrollAnimalPane = new JScrollPane();
		scrollAnimalPane.setBounds(22, 174, 380, 75);
		animalPanel.add(scrollAnimalPane);
		
		textAnimalArea = new JTextArea();
		scrollAnimalPane.setViewportView(textAnimalArea);
		
		titlePanel = new JPanel();
		titlePanel.setBounds(5, 10, 424, 36);
		contentPane.add(titlePanel);
		
		lblNewLabel = new JLabel("신규 등록");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titlePanel.add(lblNewLabel);
		
		OwnerPanel = new JPanel();
		OwnerPanel.setLayout(null);
		OwnerPanel.setBounds(5, 325, 424, 259);
		contentPane.add(OwnerPanel);
		
		lblOwnerLabel = new JLabel("보호자 정보 입력");
		lblOwnerLabel.setFont(new Font("굴림", Font.PLAIN, 18));
		lblOwnerLabel.setBounds(12, 10, 143, 25);
		OwnerPanel.add(lblOwnerLabel);
		
		lblOwnerName = new JLabel("보호자 이름");
		lblOwnerName.setFont(new Font("굴림", Font.PLAIN, 15));
		lblOwnerName.setBounds(22, 45, 75, 25);
		OwnerPanel.add(lblOwnerName);
		
		lblOwnerContact = new JLabel("연락처");
		lblOwnerContact.setFont(new Font("굴림", Font.PLAIN, 15));
		lblOwnerContact.setBounds(22, 80, 49, 25);
		OwnerPanel.add(lblOwnerContact);
		
		lblOwnerAderss = new JLabel("주소");
		lblOwnerAderss.setFont(new Font("굴림", Font.PLAIN, 15));
		lblOwnerAderss.setBounds(22, 115, 28, 25);
		OwnerPanel.add(lblOwnerAderss);
		
		textFieldOwnerName = new JTextField();
		textFieldOwnerName.setColumns(10);
		textFieldOwnerName.setBounds(109, 45, 128, 21);
		OwnerPanel.add(textFieldOwnerName);
		
		textFieldOwnerContact = new JTextField();
		textFieldOwnerContact.setColumns(10);
		textFieldOwnerContact.setBounds(83, 80, 128, 21);
		OwnerPanel.add(textFieldOwnerContact);
		
		textFieldOwnerAdress = new JTextField();
		textFieldOwnerAdress.setColumns(10);
		textFieldOwnerAdress.setBounds(83, 117, 319, 21);
		OwnerPanel.add(textFieldOwnerAdress);
		
		lblAnimalMemo_1 = new JLabel("비고");
		lblAnimalMemo_1.setFont(new Font("굴림", Font.PLAIN, 15));
		lblAnimalMemo_1.setBounds(22, 150, 28, 25);
		OwnerPanel.add(lblAnimalMemo_1);
		
		scrollOwnerPane = new JScrollPane();
		scrollOwnerPane.setBounds(22, 174, 380, 75);
		OwnerPanel.add(scrollOwnerPane);
		
		textOwnerArea = new JTextArea();
		scrollOwnerPane.setViewportView(textOwnerArea);
	}
}
