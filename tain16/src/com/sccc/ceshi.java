package com.sccc;

import java.util.ArrayList;
import java.util.HashMap;

public class ceshi {
	private ArrayList<String> zhuangtai;
	private HashMap<String,ArrayList<String>> timu;
    public ceshi(){
    	zhuangtai=new ArrayList<String>();
    	timu=new HashMap<String,ArrayList<String>>();
    	
    	//将情况添加到状态数组里
    	String qingkuang1="没接到电话";
    	//String qingkuang2="打游戏挂机";
    	zhuangtai.add(qingkuang1);
    	//zhuangtai.add(qingkuang2);
    	
    	//选项添加
    	String xuanxiang1="不想接电话";
    	String xuanxiang2="我在打游戏";
    	String xuanxiang3="编代码，改BUG";
    	String xuanxiang4="天气不错";
    	
//    	String xuanxiang11="你太菜了";
//    	String xuanxiang12="你太坑了";
//    	String xuanxiang13="你完全没玩过这个人物";
    	
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
