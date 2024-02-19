package jsp_start;

import Task8.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class JacksonTest {
    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    void pojoToJsonString() throws JsonProcessingException {
        Employee employee = new Employee("Mark", "James", 20);

        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        String json = objectMapper.writeValueAsString(employee);

        System.out.println(json);
    }

    @Test
    void jsonStringToPojo() throws JsonProcessingException {
        String employeeJson = "{\n" +
                " \"firstName\" : \"Jalil\",\n" +
                " \"lastName\" : \"Jarjanazy\",\n" +
                " \"age\" : 30\n" +
                "}";

        Employee employee = objectMapper.readValue(employeeJson, Employee.class);
        String actual = employee.getFirstName();

        Assert.assertEquals("Jalil", actual);

    }

    @Test
    void jsonFileToPojo() throws IOException {
        File file = new File("src/test/employee.json");

        Employee employee = objectMapper.readValue(file, Employee.class);

        Assert.assertEquals(44, employee.getAge());
        Assert.assertEquals("Simpson", employee.getLastName());
        Assert.assertEquals("Homer", employee.getFirstName());
    }

    @Test
    void byteArrayToPojo() throws IOException {
        String employeeJson = "{\n" +
                " \"firstName\" : \"Jalil\",\n" +
                " \"lastName\" : \"Jarjanazy\",\n" +
                " \"age\" : 30\n" +
                "}";

        Employee employee = objectMapper.readValue(employeeJson.getBytes(), Employee.class);
        System.out.println(employee);

        Assert.assertEquals(30, employee.getAge());
    }

    @Test
    void fileToPojoWithUnknownProperties() throws IOException {
        File file = new File("src/test/employeeWithUnknownProperties.json");
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        Employee employee = objectMapper.readValue(file, Employee.class);

        Assert.assertEquals(44, employee.getAge());
        Assert.assertEquals("Homer", employee.getFirstName());
        Assert.assertEquals("Simpson", employee.getLastName());
    }

    @Test
    void pojoToXML() throws JsonProcessingException {
        Employee employee = new Employee("Mark", "James", 20);

        ObjectMapper mapper = new XmlMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        String xmlEmployee = mapper.writeValueAsString(employee);
        System.out.println(xmlEmployee);
    }

    @Test
    void xmlToPojo() throws JsonProcessingException {
        String xmlString = "<Employee>\n" +
                "  <firstName>Mark</firstName>\n" +
                "  <lastName>James</lastName>\n" +
                "  <age>20</age>\n" +
                "</Employee>\n";

        ObjectMapper mapper = new XmlMapper();
        Employee employee= mapper.readValue(xmlString, Employee.class);
        System.out.println(employee);

        Assert.assertEquals("Mark", employee.getFirstName());

    }

}
