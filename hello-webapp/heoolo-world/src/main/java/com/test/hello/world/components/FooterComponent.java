package com.test.hello.world.components;

import javax.jcr.Node;

import info.magnolia.dam.app.ui.config.DamConfig;
import info.magnolia.module.blossom.annotation.TabFactory;
import info.magnolia.module.blossom.annotation.Template;
import info.magnolia.ui.form.config.AbstractFieldBuilder;
import info.magnolia.ui.form.config.TabBuilder;
import info.magnolia.ui.framework.config.UiConfig;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Template(title = "Footer Component", id = "heoolo-world:components/footer")
public class FooterComponent {

	private static final String DEFAULT_FOOTER_VALUE = "All rights reserved";

	@RequestMapping("/footer")
	public String render(Node page, ModelMap model) {
		return "components/footer.jsp";
	}

	@TabFactory("Content")
	public void contentTab(UiConfig cfg, DamConfig dam, TabBuilder tab) {
		AbstractFieldBuilder headerConntent = cfg.fields.text("headerContent").defaultValue(DEFAULT_FOOTER_VALUE).rows(5).label("Header Content");

		tab.fields(headerConntent);
	}
}
