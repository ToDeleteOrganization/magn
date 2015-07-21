package com.test.hello.world.components;

import info.magnolia.dam.app.ui.config.DamConfig;
import info.magnolia.module.blossom.annotation.TabFactory;
import info.magnolia.module.blossom.annotation.Template;
import info.magnolia.ui.form.config.TabBuilder;
import info.magnolia.ui.framework.config.UiConfig;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Template(title="Picture comp", id="heoolo-world:components/photo")
public class PictureComponent {

    @RequestMapping("/photo")
    public String render() {
        return "components/photo.jsp";
    }

    @TabFactory("Content")
    public void contentTab(UiConfig cfg, DamConfig dam, TabBuilder tab) {
        tab.fields(
                dam.fields.assetLink("photo").label("Photo")
        );
    }
}
