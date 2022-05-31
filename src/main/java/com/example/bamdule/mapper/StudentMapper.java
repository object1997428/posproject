package com.example.bamdule.mapper;

import com.example.bamdule.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface StudentMapper {
    public List<Student> findList();

    public Student findOneByCode(String codes);

    public void save(Student student);

    public void update(Student student);

    public void deleteById(Integer id);
}
