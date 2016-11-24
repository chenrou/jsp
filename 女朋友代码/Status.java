package jsp2;

import java.util.ArrayList;
import java.util.HashMap;

public class Status {

	private ArrayList<String> zhuangtai;
	private HashMap<String,ArrayList<String>> timu;
	
	public Status(){
		zhuangtai=new ArrayList<String>();
		timu=new HashMap<String,ArrayList<String>>();
		
		//情况添加
		String qingkuang="没有接到女朋友电话";
		zhuangtai.add(qingkuang);
		
		//选项添加
		String xuanxiang1="我手机静音了";
		String xuanxiang2="我手机静音了";
		String xuanxiang3="我在给你买东西";
		String xuanxiang4="我在工作";
		
		ArrayList<String> temp=new ArrayList<String>();
		//生成中间变量
		temp.add(xuanxiang1);
		temp.add(xuanxiang2);
		temp.add(xuanxiang3);
		temp.add(xuanxiang4);
		
		//将情况和选项收入hash表
		timu.put(qingkuang, temp);

	}
	public ArrayList<String> getzhuangtai(){
		return zhuangtai;
	}
	public void setzhuangtai(ArrayList<String> zhuangtai){
		this.zhuangtai=zhuangtai;
		
	}
	public HashMap<String,ArrayList<String>> getTimu(){
		return timu;
		
	}
		
	
}
