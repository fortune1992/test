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

		// controll 控制器
		// 设置listview的数据适配器控制器
		lv.setAdapter(new MyAdapter());
	}

	public class MyAdapter extends BaseAdapter {
		// 获取列表里面一共有多少条记录
		@Override
		public int getCount() {
			return 1000000;
		}

		// 返回一个view对象,这个view对象显示在指定的位置position
		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			TextView tv = null;
			if (convertView == null) {
				tv = new TextView(getApplicationContext());//回收的view不存在
				System.out.println("创建新的View:"+position);
			} else {
				tv = (TextView) convertView;//回收的view 存在了 ,复用
				System.out.println("使用回收的View："+position);
			}
			tv.setText("我是文本：" + position);
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
