package com.test.hello.world.pages;

import info.magnolia.module.blossom.annotation.Area;
import info.magnolia.module.blossom.annotation.Template;
import info.magnolia.module.blossom.annotation.TemplateDescription;

import javax.jcr.Node;
import javax.jcr.RepositoryException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Template(title = "Demo Template", id = "demoModule:pages/mainHelloPage") // TODO: module name: heoolo-world
@TemplateDescription("Demo template description!")
public class MainTemplate {

	@RequestMapping("/mainTemplate")
	public String render(Node page, ModelMap model) throws RepositoryException {
		return "pages/mainHelloPage.jsp";
	}

	@Controller
	@Area(value = "header", title = "Header")
	public static class Header {
		@RequestMapping("/mainTemplate/header")
		public String render() {
			return "areas/header.jsp";
		}
	}

	@Controller
	@Area(value = "footer", title = "Footer")
	public static class Footer {
		@RequestMapping("/mainTemplate/footer")
		public String render() {
			return "areas/footer.jsp";
		}

	}

	@Controller
	@Area(value = "mainArea", title = "MainArea")
	public static class MainArea {
		@RequestMapping("/mainTemplate/mainArea")
		public String render() {
			return "areas/mainArea.jsp";
		}

	}
}
