package com.qq.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.*;

public class QqClientLogin extends JFrame {

	// ���山����Ҫ���
	JLabel jbl1;

	// �����в���Ҫ���
	// �в�������panel����ѡ����ڹ���
	JTabbedPane jtp;
	JPanel jp2, jp3, jp4;
	JLabel jp2_jbl1, jp2_jbl2, jp2_jbl3, jp2_jbl4;
	JButton jp2_jb1;
	JTextField jp2_jtf;
	JPasswordField jp2_jpf;
	JCheckBox jp2_jcb1, jp2_jcb2;

	// �����ϲ���Ҫ���
	JPanel jp1;
	JButton jp1_jb1, jp1_jb2, jp1_jb3;

	public static void main(String[] args) {
		new QqClientLogin();
	}

	public QqClientLogin() {
		// ��������
		jbl1 = new JLabel(new ImageIcon("image/tou.gif"));

		// �����в�
		jp2 = new JPanel(new GridLayout(3, 3));
		jp2_jbl1 = new JLabel("QQ����", JLabel.CENTER);
		jp2_jbl2 = new JLabel("QQ����", JLabel.CENTER);
		jp2_jbl3 = new JLabel("��������", JLabel.CENTER);
		jp2_jbl3.setForeground(Color.BLUE);
		jp2_jbl4 = new JLabel("�������뱣��", JLabel.CENTER);
		jp2_jb1 = new JButton(new ImageIcon("image/clear.gif"));
		jp2_jtf = new JTextField();
		jp2_jpf = new JPasswordField();
		jp2_jcb1 = new JCheckBox("������½");
		jp2_jcb2 = new JCheckBox("��ס����");

		jp2.add(jp2_jbl1);
		jp2.add(jp2_jtf);
		jp2.add(jp2_jb1);
		jp2.add(jp2_jbl2);
		jp2.add(jp2_jpf);
		jp2.add(jp2_jbl3);
		jp2.add(jp2_jcb1);
		jp2.add(jp2_jcb2);
		jp2.add(jp2_jbl4);
		
		jp3 = new JPanel();
		
		
		jp4 = new JPanel();
		
		
		jtp = new JTabbedPane();
		jtp.add("QQ����", jp2);
		jtp.add("�ֻ�����", jp3);
		jtp.add("��������", jp4);

		// �����ϲ�
		jp1 = new JPanel();
		jp1_jb1 = new JButton(new ImageIcon("image/denglu.gif"));
		jp1_jb2 = new JButton(new ImageIcon("image/quxiao.gif"));
		jp1_jb3 = new JButton(new ImageIcon("image/xiangdao.gif"));

		jp1.add(jp1_jb1);
		jp1.add(jp1_jb2);
		jp1.add(jp1_jb3);

		this.add(jbl1, "North");
		this.add(jtp, "Center");
		this.add(jp1, "South");
		this.setSize(350, 240);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

}