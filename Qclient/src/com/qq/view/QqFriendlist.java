package com.qq.view;

/*
 * �ҵĺ����б� 
 */

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class QqFriendlist extends JFrame implements ActionListener, MouseListener {

	CardLayout cl;

	// ���ѿ�Ƭ
	JPanel jphy1, jphy2, jphy3;
	JScrollPane jsp1;
	JButton jphy_jb1, jphy_jb2, jphy_jb3;

	// İ���˿�Ƭ
	JPanel jpmsr1, jpmsr2, jpmsr3;
	JScrollPane jsp2;
	JButton jpmsr_jb1, jpmsr_jb2, jpmsr_jb3;

	public static void main(String[] args) {
		new QqFriendlist();
	}

	public QqFriendlist() {
		// �����б�Ƭ
		jphy_jb1 = new JButton("�ҵĺ���");
		jphy_jb2 = new JButton("İ����");
		jphy_jb2.addActionListener(this);
		jphy_jb2.setActionCommand("msr");
		jphy_jb3 = new JButton("������");
		jphy1 = new JPanel(new BorderLayout());

		// �ٶ���50������
		jphy2 = new JPanel(new GridLayout(50, 1, 4, 4));
		jphy3 = new JPanel(new GridLayout(2, 1));

		// ��jphy2��ʼ��50����
		JLabel[] jbls = new JLabel[50];

		for (int i = 0; i < jbls.length; i++) {
			jbls[i] = new JLabel(i + 1 + " ", new ImageIcon("image/mm.jpg"),
					JLabel.LEFT);
			jbls[i].addMouseListener(this);
			jphy2.add(jbls[i]);
		}

		// ��������ť�ӵ�jphy3
		jphy3.add(jphy_jb2);
		jphy3.add(jphy_jb3);

		jsp1 = new JScrollPane(jphy2);

		jphy1.add(jphy_jb1, "North");
		jphy1.add(jsp1, "Center");
		jphy1.add(jphy3, "South");

		// ����İ���˿�Ƭ
		jpmsr_jb1 = new JButton("�ҵĺ���");
		jpmsr_jb1.addActionListener(this);
		jpmsr_jb1.setActionCommand("hy");
		jpmsr_jb2 = new JButton("İ����");
		jpmsr_jb3 = new JButton("������");
		jpmsr1 = new JPanel(new BorderLayout());

		// �ٶ���20��İ����
		jpmsr2 = new JPanel(new GridLayout(20, 1, 4, 4));
		jpmsr3 = new JPanel(new GridLayout(2, 1));

		// ��jpmsr2��ʼ��20İ����
		JLabel[] jbls2 = new JLabel[20];

		for (int i = 0; i < jbls2.length; i++) {
			jbls2[i] = new JLabel(i + 1 + " ", new ImageIcon("image/mm.jpg"),
					JLabel.LEFT);
			jbls2[i].addMouseListener(this);
			jpmsr2.add(jbls2[i]);
		}

		// ��������ť�ӵ�jphy3
		jpmsr3.add(jpmsr_jb1);
		jpmsr3.add(jpmsr_jb2);

		jsp2 = new JScrollPane(jpmsr2);

		jpmsr1.add(jpmsr3, "North");
		jpmsr1.add(jsp2, "Center");
		jpmsr1.add(jpmsr_jb3, "South");

		cl = new CardLayout();
		this.setLayout(cl);
		this.add(jphy1, "1");
		this.add(jpmsr1, "2");

		this.setSize(180, 400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("msr")) {
			cl.show(this.getContentPane(), "2");
		} else if (e.getActionCommand().equals("hy")) {
			cl.show(this.getContentPane(), "1");
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getClickCount() == 2) {
			String friendNo = ((JLabel)e.getSource()).getText();
			System.out.println("��ϣ����" + friendNo + "����");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		JLabel j1 = (JLabel)e.getSource();
		j1.setForeground(Color.RED);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		JLabel j1 = (JLabel)e.getSource();
		j1.setForeground(Color.BLACK);
	}

}
