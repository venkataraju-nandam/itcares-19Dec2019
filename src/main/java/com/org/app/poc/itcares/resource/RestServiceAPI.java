package com.org.app.poc.itcares.resource;


import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.org.app.poc.itcares.bean.Greeting;;

@RestController
public class RestServiceAPI {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
    
//    http://localhost:8080/greeting
//    Result: {"id":1,"content":"Hello, World!"}
//    http://localhost:8080/greeting?name=Raju
}

//@RestController
//public class TestController {
//
//    @Autowired
//    private RestTemplate restTemplate;
//
//    @RequestMapping(value="/micro/order/{id}",
//        method=RequestMethod.GET,
//        produces=MediaType.ALL_VALUE)
//    public String placeOrder(@PathVariable("id") int customerId){
//
//        System.out.println("Hit ===> PlaceOrder");
//
//        Object[] customerJson = restTemplate.getForObject("http://localhost:8080/micro/customers", Object[].class);
//
//        System.out.println(customerJson.toString());
//
//        return "false";
//    }
//
//}