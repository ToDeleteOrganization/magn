package com.test.hello.world.components;

import info.magnolia.dam.app.ui.config.DamConfig;
import info.magnolia.module.blossom.annotation.TabFactory;
import info.magnolia.module.blossom.annotation.Template;
import info.magnolia.ui.form.config.AbstractFieldBuilder;
import info.magnolia.ui.form.config.TabBuilder;
import info.magnolia.ui.framework.config.UiConfig;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.jcr.Node;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Template(title = "HeaderComp comp", id = "heoolo-world:components/header")
public class HeaderComponent {

	private static final String TODAY_DATE_PATTERN = "dd, MMM - YYYY";

	@RequestMapping("/header")
	public String render(Node page, ModelMap model) {
		String todayDate = convertDatetoString(TODAY_DATE_PATTERN, getTodayDate());
		// TODO: remove logic from ui and keep it in backend
		model.put("todayDate", todayDate);
		return "components/header.jsp";
	}

	@TabFactory("Content")
	public void contentTab(UiConfig cfg, DamConfig dam, TabBuilder tab) {
		AbstractFieldBuilder hidedDate = cfg.fields.checkbox("hideDate").label("Hide the Date").buttonLabel("");
		AbstractFieldBuilder headerConntent = cfg.fields.text("headerContent").rows(5).label("Header Content");

		tab.fields(hidedDate, headerConntent);
	}

	private Date getTodayDate() {
		return Calendar.getInstance().getTime();
	}

	private String convertDatetoString(String pattern, Date date) {
		return new SimpleDateFormat(pattern).format(date);
	}
}
