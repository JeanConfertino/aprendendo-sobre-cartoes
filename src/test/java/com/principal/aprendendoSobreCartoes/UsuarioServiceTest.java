package com.principal.aprendendoSobreCartoes;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsuarioServiceTest {

    private UsuarioService usuarioService;

    @BeforeEach
    void setUp() {
        usuarioService = new UsuarioService();
    }

    @Test
    void exemploDeTesteSimples() {
        String nome = "d";
        assertThat(nome).isEqualTo("d");
    }
}
