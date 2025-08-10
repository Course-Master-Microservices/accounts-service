package dev.alho.account;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAware")
@OpenAPIDefinition(
		info=@Info(
			title = "Accounts Service REST API",
			version = "v1",
			description = "API for managing customer accounts.",
			contact = @Contact(
					name = "Alho",
					email = "tutor@alho.dev",
					url = "https://alho.dev"
				),
			license = @License(
					name = "Apache License 2.0",
					url = "https://www.apache.org/licenses/LICENSE-2.0"
				)
			),
		externalDocs = @ExternalDocumentation(
				description = "API Documentation",
				url = "https://alho.dev/docs/accounts-service-api"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
