package com.sccc;

import java.util.ArrayList;
import java.util.HashMap;

public class ceshi {
	private ArrayList<String> zhuangtai;
	private HashMap<String,ArrayList<String>> timu;
    public ceshi(){
    	zhuangtai=new ArrayList<String>();
    	timu=new HashMap<String,ArrayList<String>>();
    	
    	//�������ӵ�״̬������
    	String qingkuang1="û�ӵ��绰";
    	//String qingkuang2="����Ϸ�һ�";
    	zhuangtai.add(qingkuang1);
    	//zhuangtai.add(qingkuang2);
    	
    	//ѡ�����
    	String xuanxiang1="����ӵ绰";
    	String xuanxiang2="���ڴ���Ϸ";
    	String xuanxiang3="����룬��BUG";
    	String xuanxiang4="��������";
    	
//    	String xuanxiang11="��̫����";
//    	String xuanxiang12="��̫����";
//    	String xuanxiang13="����ȫû����������";
    	
    	//ArrayList<String> temp1=new ArrayList<String>();
    	ArrayList<String> temp=new ArrayList<String>();
    	temp.add(xuanxiang1);
    	temp.add(xuanxiang2);
    	temp.add(xuanxiang3);
    	temp.add(xuanxiang4);
    	
//    	temp1.add(xuanxiang11);
//    	temp1.add(xuanxiang12);
//    	temp1.add(xuanxiang13);
    	
    	timu.put(qingkuang1, temp);
    	//timu.put(qingkuang2, temp1);
    }
    public ArrayList<String> getZhuangTai(){
    	return zhuangtai;
    }
    public void setZhuangTai(ArrayList<String> zhuangtai){
    	this.zhuangtai=zhuangtai;
    }
    public HashMap<String,ArrayList<String>> getTiMu(){
    	return timu;
    }
}
