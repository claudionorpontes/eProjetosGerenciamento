package testes.unitarios;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.Order;
import org.junit.rules.TestWatcher;
import org.junit.rules.TestWatchman;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings({ "deprecation", "unused" })
@SpringBootTest
@AutoConfigureMockMvc
@RestController
public class GreetingsControllerTest<Usuario> {
	
	
	@RequestMapping(value = "/mostrarnome/name}" , method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public String greetingText(@PathVariable String name) {
		return "Core Tecnologia: " + name + "!";
	}
	
    @ClassRule
    public static final SpringClassRule springClassRule = new SpringClassRule();

    @Rule
    public final SpringMethodRule springMethodRule = new SpringMethodRule();

    @Rule
    public TestWatcher watchman;

    @Autowired
    private MockMvc mockMvc;

	private Object usuarioRepository;

	private Usuario user;

    @BeforeClass
    public static void setUpClass() {
        registerClass(GreetingsControllerTest.class);
    }

    @SuppressWarnings("rawtypes")
	private static void registerClass(Class<GreetingsControllerTest> class1) {
		
		
	}

	@AfterClass
    public static void tearDownClass() {
        createReport(GreetingsControllerTest.class);
    }

    private static void createReport(@SuppressWarnings("rawtypes") Class<GreetingsControllerTest> class1) {
		
	}

	/**
     *
     * @throws Exception
     *
     * It tests response to be "Hello Java!"
     */
    @Test
    @Order(1)
    public void greetJava() throws Exception {
        String response = mockMvc.perform(MockMvcRequestBuilders.get("/Java"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andReturn()
            .getResponse()
            .getContentAsString();

        Assert.assertEquals(response, "Hello Java!");
    }

    /**
     *
     * @throws Exception
     *
     * It tests response to be "Hello Core!"
     */
    @Test
    @Order(2)
    public void greetSpring() throws Exception {
        String response = mockMvc.perform(MockMvcRequestBuilders.get("/Spring"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andReturn()
            .getResponse()
            .getContentAsString();

        Assert.assertEquals(response, "Hello Core!");
    }

    /**
     *
     * @throws Exception
     *
     * It tests response to be "Olá Core!"
     */
    @Test
    @Order(3)
    public void greetRodJohnson() throws Exception {
        String response = mockMvc.perform(MockMvcRequestBuilders.get("/RodJohnson"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andReturn()
            .getResponse()
            .getContentAsString();

        Assert.assertEquals(response, "Core Tecnologia!");
        
    }
    
    @SuppressWarnings("rawtypes")
	@GetMapping(value = "listatodos")
    @ResponseBody
    public ResponseEntity<List> listaUsuarioEntity(){
		return null;
    	
    }
    	   	
    	
	@SuppressWarnings("unused")
	private HttpStatus usuarioRepository() {
		return null;
		
	}
	
	@PostMapping(value = "salvar")
	@ResponseBody
	public ResponseEntity<Usuario> salvar (@RequestBody Usuario usuario){
		return null;
		
		
	}

	public Object getUsuarioRepository() {
		return usuarioRepository;
	}

	public void setUsuarioRepository(Object usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	
	}
		
	
    
















