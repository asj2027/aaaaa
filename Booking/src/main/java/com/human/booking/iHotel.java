package com.human.booking;

import java.util.ArrayList;

import com.human.booking.hotelDTO;

public interface iHotel {
	ArrayList<hotelDTO> list(); //ȣ�� ���̺� ����Ʈ
	ArrayList<hotelDTO> getlist(); //�� ���̺� ����Ʈ
	int addhotel(String name, int type, int num, int price); //ȣ�� ���̺� insert
	hotelDTO viewlist(int seq);
	int updatehotel(String name, int type, int num, int price, int seq); //ȣ�� ���̺� ������Ʈ
	int deletehotel(int seq); //ȣ�� ���̺� delete
	
	ArrayList<hotelDTO> yeyaklist(int type, int num, String checkin, String checkout); //���డ���� ���� select
	ArrayList<hotelDTO> notlist(int type, int tnum, String checkin, String checkout); //����Ұ��� ����
	
	ArrayList<hotelDTO> conlist(int order_no); //������ ������ ���೻��
	int addcon(int seq, int tnum, String checkin, String checkout, String tname, String mobile, int tprice, int type); //���� �߰�
	int updatecon(int tnum, String tname, String mobile, int order_no); //���� ����
	int deletecon(int order_no); //���� ����
}
