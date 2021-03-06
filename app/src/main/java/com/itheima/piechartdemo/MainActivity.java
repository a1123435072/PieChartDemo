package com.itheima.piechartdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
	private int[] colors = {0xFFCCFF00, 0xFF6495ED, 0xFFE32636, 0xFF800000, 0xFF808000, 0xFFFF8C69, 0xFF808080,
			0xFFE6B800, 0xFF7CFC00};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Pie pie = (Pie) findViewById(R.id.pie);
		List<PieEntity> entities = new ArrayList<>();
		for (int i = 0; i < 9; i++) {
			entities.add(new PieEntity(i + 1, colors[i]));
		}
		pie.setDatas(entities);

	}
}
