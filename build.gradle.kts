plugins {
	java
	id("org.springframework.boot") version "3.3.0-M3"
	id("io.spring.dependency-management") version "1.1.4"
}

group = "cat.itacademy.barcelonactiva.diazdiaz.dani.s04.t01.n02"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
	maven { url = uri("https://repo.spring.io/milestone") }
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
