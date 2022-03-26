package com.jikim.javaoop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void main() {
	    // given
		String[] args = {"3", "1", "2"};

	    // when & then
		Main.main(args);

	}
}