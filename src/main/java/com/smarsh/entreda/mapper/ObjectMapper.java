package com.smarsh.entreda.mapper;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ObjectMapper {

    private final ModelMapper modelMapper;

    /**
     *
     * @param source object the property/ value copied from
     * @param target class where property will be copied to
     * @return target class object
     */
    public Object copyObject(Object source, Class target) {
        return modelMapper.map(source, target);
    }
}

