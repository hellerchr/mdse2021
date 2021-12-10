package com.dhbw.mdse;

import com.dhbw.mdse.domain.engineer.Engineer;
import com.dhbw.mdse.domain.student.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class FormatTest {

    @Test
    public void json() throws IOException {
        Student student = read("/student.json", Student.class, new ObjectMapper());
        assertThat(student).isEqualToComparingFieldByFieldRecursively(TestData.student());
    }

    @Test
    public void yaml() throws IOException {
        Student student = read("/student.yaml", Student.class, new YAMLMapper());
        assertThat(student).isEqualToComparingFieldByFieldRecursively(TestData.student());
    }

    @Test
    public void xml() throws IOException {
        Student student = read("/student.xml", Student.class, new XmlMapper());
        assertThat(student).isEqualToComparingFieldByFieldRecursively(TestData.student());
    }

    private <T> T read(String classpathFile, Class<T> clazz, ObjectMapper objectMapper) throws IOException {
        return objectMapper.readValue(getClass().getResourceAsStream(classpathFile), clazz);
    }
}
