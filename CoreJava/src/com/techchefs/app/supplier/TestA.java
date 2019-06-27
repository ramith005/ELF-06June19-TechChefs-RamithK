package com.techchefs.app.supplier;

import java.util.function.Supplier;
import lombok.extern.java.Log;

@Log
public class TestA {

	public static void main(String[] args) {
		Supplier<Gun> v = ()->new Gun(100);
		Gun g = v.get();
		log.info("Bullets "+g.bullets);
	}

}
