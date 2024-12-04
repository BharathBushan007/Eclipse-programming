package com.hotstar.testFiles;

import org.testng.annotations.Test;

import com.pageObjectModel.CategoriesPage;
import com.practice.utils.BaseClass;

public class CategoriesColor extends BaseClass{
	
	@Test
	public void ColorAndTextStyle() {
		CategoriesPage CatPage = new CategoriesPage(driver);
		CatPage.OptionCategories();
	}

}
