package jsp2;

import java.util.ArrayList;
import java.util.HashMap;

public class Status {

	private ArrayList<String> zhuangtai;
	private HashMap<String,ArrayList<String>> timu;
	
	public Status(){
		zhuangtai=new ArrayList<String>();
		timu=new HashMap<String,ArrayList<String>>();
		
		//������
		String qingkuang="û�нӵ�Ů���ѵ绰";
		zhuangtai.add(qingkuang);
		
		//ѡ�����
		String xuanxiang1="���ֻ�������";
		String xuanxiang2="���ֻ�������";
		String xuanxiang3="���ڸ�������";
		String xuanxiang4="���ڹ���";
		
		ArrayList<String> temp=new ArrayList<String>();
		//�����м����
		temp.add(xuanxiang1);
		temp.add(xuanxiang2);
		temp.add(xuanxiang3);
		temp.add(xuanxiang4);
		
		//�������ѡ������hash��
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
