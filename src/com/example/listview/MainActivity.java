package com.example.listview;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

	private ListView lv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		lv = (ListView) findViewById(R.id.lv);

		// controll ������
		// ����listview������������������
		lv.setAdapter(new MyAdapter());
	}

	public class MyAdapter extends BaseAdapter {
		// ��ȡ�б�����һ���ж�������¼
		@Override
		public int getCount() {
			return 1000000;
		}

		// ����һ��view����,���view������ʾ��ָ����λ��position
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			TextView tv = null;
			if (convertView == null) {
				tv = new TextView(getApplicationContext());//���յ�view������
				System.out.println("�����µ�View:"+position);
			} else {
				tv = (TextView) convertView;//���յ�view ������ ,����
				System.out.println("ʹ�û��յ�View��"+position);
			}
			tv.setText("�����ı���" + position);
			tv.setTextColor(Color.RED);
			tv.setTextSize(20);
			return tv;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return 0;
		}
	}
}
