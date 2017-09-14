package learn.spring.camel.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class LocalFileReaderRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:/Users/amandeepsingh/CodeConcepts/Spring/github/spring-camel/src/main/resources/?fileName=camel-input-1.txt&noop=true")
		.log("got file ${body}");

	}

}
