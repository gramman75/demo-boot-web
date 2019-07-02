package com.gramman75;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
// @WebMvcTest /* Web과 관련된 Bean만 등록을 함. @Component는 등록되지 않음. */
@SpringBootTest /*모든 Bean을 등록함. */
@AutoConfigureMockMvc /* @WebMvcTest를 사용하지 않을 경우 MockMvc등록을 위한 Annotation */ 
public class SimpleControllerTest {
	
	@Autowired
	MockMvc mockMvc;
	
	@Autowired
	PersonRepository repository;
	
	@Test
	public void hello() throws Exception {
		
		Person person = new Person();
		person.setName("gramman75");
		Person savedPerson = repository.save(person);
		
		this.mockMvc.perform(get("/hello").param("id", savedPerson.getId().toString()))
           .andDo(print())
           .andExpect(content().string("hello gramman75"));
	}
}
