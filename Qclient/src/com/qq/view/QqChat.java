package com.qq.view;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class QqChat extends JFrame {
	
	JTextArea jta;
	JTextField jtf;
	JButton jb;
	JPanel jp;
	
	public static void main(String[] args) {
		new QqChat("1");
	}
	
	public QqChat(String friend) {
		jta = new JTextArea();
		jtf = new JTextField(15);
		jb = new JButton("发送");
		jp = new JPanel();
		
		jp.add(jtf);
		jp.add(jb);
		
		this.setIconImage((new ImageIcon("image/qq.gif")).getImage());
		this.setTitle("你正在和" + friend + "聊天");
		this.add(jta,"Center");		
		this.add(jp, "South");
		this.setSize(300, 200);
		this.setVisible(true);
	}
	
}
