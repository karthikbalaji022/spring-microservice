package com.microservices.limitservice.limitservice.dao;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class LimitDao {
	private int min;
	private int max;

	public LimitDao(int min, int max) {
		this.setMin(min);
		this.setMax(max);
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
}
