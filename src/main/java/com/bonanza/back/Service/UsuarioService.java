package com.bonanza.back.Service;

import com.bonanza.back.Model.Usuario;
import com.bonanza.back.Model.UsuarioRol;

import java.util.List;
import java.util.Set;

public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

    public Usuario obtenerUsuario(String username);

    public void eliminarUsuario(Long usuarioId);

    Set<Usuario> obtenerUsuarios();

    Usuario actualizarPersona(Usuario usuario);

    Usuario obteneruser(Long userId);

    public List<Usuario> findAll();
}