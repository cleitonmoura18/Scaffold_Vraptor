package br.com.cleiton.Scafolld;

import java.io.File;
/**
 * Hello world!
 *
 */
import java.io.StringWriter;

import org.apache.commons.io.FileUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

public class HelloWorld {
	public static void main(String[] args) throws Exception {
		TemplateScaffold templateScaffold = buildTemplate();
		VelocityEngine ve = new VelocityEngine();
		ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
		ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		ve.init();
		VelocityContext context = new VelocityContext();

		context.put("classe", templateScaffold);
		Template t = ve.getTemplate("templates/list.html");
		StringWriter writer = new StringWriter();
		t.merge(context, writer);
		FileUtils.writeStringToFile(new File("C:\\Users\\clebe\\Desktop\\list.html"), writer.toString());

	}

	private static TemplateScaffold buildTemplate() {
		TemplateScaffold templateScaffold = new TemplateScaffold();
		templateScaffold.setTitulo("Pessoas");
		templateScaffold
		.add(CampoBuilder.create("nome", "Nome"))
		.add(CampoBuilder.create("idade", "Idade",TipoCampoEnum.INT))
		.add(CampoBuilder.create("telefone", "Telefone",TipoCampoEnum.DATA))
		.add(CampoBuilder.create("cep", "Cep"));
		return templateScaffold;
	}
}