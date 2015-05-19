package com.qq.view;

/*
 * 我的好友列表 
 */

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class QqFriendlist extends JFrame implements ActionListener, MouseListener {

	CardLayout cl;

	// 好友卡片
	JPanel jphy1, jphy2, jphy3;
	JScrollPane jsp1;
	JButton jphy_jb1, jphy_jb2, jphy_jb3;

	// 陌生人卡片
	JPanel jpmsr1, jpmsr2, jpmsr3;
	JScrollPane jsp2;
	JButton jpmsr_jb1, jpmsr_jb2, jpmsr_jb3;

	public static void main(String[] args) {
		new QqFriendlist();
	}

	public QqFriendlist() {
		// 好友列表卡片
		jphy_jb1 = new JButton("我的好友");
		jphy_jb2 = new JButton("陌生人");
		jphy_jb2.addActionListener(this);
		jphy_jb2.setActionCommand("msr");
		jphy_jb3 = new JButton("黑名单");
		jphy1 = new JPanel(new BorderLayout());

		// 假定有50个好友
		jphy2 = new JPanel(new GridLayout(50, 1, 4, 4));
		jphy3 = new JPanel(new GridLayout(2, 1));

		// 给jphy2初始化50好友
		JLabel[] jbls = new JLabel[50];

		for (int i = 0; i < jbls.length; i++) {
			jbls[i] = new JLabel(i + 1 + " ", new ImageIcon("image/mm.jpg"),
					JLabel.LEFT);
			jbls[i].addMouseListener(this);
			jphy2.add(jbls[i]);
		}

		// 把两个按钮加到jphy3
		jphy3.add(jphy_jb2);
		jphy3.add(jphy_jb3);

		jsp1 = new JScrollPane(jphy2);

		jphy1.add(jphy_jb1, "North");
		jphy1.add(jsp1, "Center");
		jphy1.add(jphy3, "South");

		// 处理陌生人卡片
		jpmsr_jb1 = new JButton("我的好友");
		jpmsr_jb1.addActionListener(this);
		jpmsr_jb1.setActionCommand("hy");
		jpmsr_jb2 = new JButton("陌生人");
		jpmsr_jb3 = new JButton("黑名单");
		jpmsr1 = new JPanel(new BorderLayout());

		// 假定有20个陌生人
		jpmsr2 = new JPanel(new GridLayout(20, 1, 4, 4));
		jpmsr3 = new JPanel(new GridLayout(2, 1));

		// 给jpmsr2初始化20陌生人
		JLabel[] jbls2 = new JLabel[20];

		for (int i = 0; i < jbls2.length; i++) {
			jbls2[i] = new JLabel(i + 1 + " ", new ImageIcon("image/mm.jpg"),
					JLabel.LEFT);
			jbls2[i].addMouseListener(this);
			jpmsr2.add(jbls2[i]);
		}

		// 把两个按钮加到jphy3
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
			System.out.println("你希望和" + friendNo + "聊天");
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
