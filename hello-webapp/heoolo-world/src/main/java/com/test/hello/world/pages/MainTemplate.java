package com.test.hello.world.pages;

import info.magnolia.dam.templating.functions.DamTemplatingFunctions;
import info.magnolia.module.blossom.annotation.Area;
import info.magnolia.module.blossom.annotation.AvailableComponentClasses;
import info.magnolia.module.blossom.annotation.TabFactory;
import info.magnolia.module.blossom.annotation.Template;
import info.magnolia.module.blossom.annotation.TemplateDescription;
import info.magnolia.ui.form.config.TabBuilder;
import info.magnolia.ui.framework.config.UiConfig;

import javax.jcr.Node;
import javax.jcr.RepositoryException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.hello.world.components.FooterComponent;
import com.test.hello.world.components.HeaderComponent;
import com.test.hello.world.components.PictureComponent;

@Controller
@Template(title = "Demo Template", id = "heoolo-world:pages/mainHelloPage", visible = true)
@TemplateDescription("Demo template description!")
public class MainTemplate {

	@RequestMapping("/mainTemplate")
	public String render(Node page, ModelMap model) throws RepositoryException {
		return "pages/mainHelloPage.jsp";
	}

	@Controller
	@Area(value = "header", title = "Header")
	@AvailableComponentClasses({ HeaderComponent.class })
	public static class Header {
		@RequestMapping("/mainTemplate/header")
		public String render() {
			return "areas/header.jsp";
		}
	}

	@Controller
	@Area(value = "footer", title = "Footer")
	@AvailableComponentClasses({ FooterComponent.class })
	public static class Footer {
		@RequestMapping("/mainTemplate/footer")
		public String render() {
			return "areas/footer.jsp";
		}

	}

	@Controller
	@Area(value = "mainArea", title = "MainArea")
	@AvailableComponentClasses({ PictureComponent.class })
	public static class MainArea {
		@RequestMapping("/mainTemplate/mainArea")
		public String render() {
			return "areas/mainArea.jsp";
		}

	}

	@TabFactory("Content")
	public void contentTab(UiConfig cfg, TabBuilder tab) {
		tab.fields(
			cfg.fields.text("title").label("Titlul paginii"), 
			cfg.fields.richText("mainContent").label("Main body text"),
			cfg.fields.date("testDate").label("select a date and do nothing with it."));
	}
}
