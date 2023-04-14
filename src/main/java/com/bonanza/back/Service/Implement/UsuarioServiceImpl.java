package com.bonanza.back.Service.Implement;

import com.bonanza.back.Model.Usuario;
import com.bonanza.back.Model.UsuarioRol;
import com.bonanza.back.Repository.RolRepository;
import com.bonanza.back.Repository.UsuarioRepository;
import com.bonanza.back.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.LinkedHashSet;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RolRepository rolRepository;

    public UsuarioServiceImpl() {
    }

    @Override
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception {
        Usuario usuarioLocal = usuarioRepository.findByUsername(usuario.getUsername());
        if(usuarioLocal != null){
            System.out.println("El usuario ya existe");
            throw new Exception("El usuario ya esta presente");
        }
        else{
            for(UsuarioRol usuarioRol:usuarioRoles){
                rolRepository.save(usuarioRol.getRol());
            }
            usuario.getUsuarioRoles().addAll(usuarioRoles);
            usuarioLocal = usuarioRepository.save(usuario);
        }
        return usuarioLocal;
    }

    @Override
    public void eliminarUsuario(Long usuarioId) {
        usuarioRepository.deleteById(usuarioId);
    }

    @Override
    public Set<Usuario> obtenerUsuarios() {
        return new LinkedHashSet<>(usuarioRepository.findAll());
    }

    @Override
    public Usuario obtenerUsuario(String username) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Usuario actualizarPersona(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario obteneruser(Long userId) {
        return usuarioRepository.findById(userId).get();

    }


    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public List<Usuario> findAll(Sort sort) {
        return usuarioRepository.findAll(sort);
    }


    public Page<Usuario> findAll(Pageable pageable) {
        return usuarioRepository.findAll(pageable);
    }




}
