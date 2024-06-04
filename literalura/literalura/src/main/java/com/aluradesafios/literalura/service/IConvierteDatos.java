package com.aluradesafios.literalura.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class IConvierteDatos  {

    <T> T obtenerDatos(String json, Class<T> clase);

}
