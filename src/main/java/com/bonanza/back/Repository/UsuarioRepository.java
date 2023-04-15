package com.bonanza.back.Repository;

import com.bonanza.back.Model.Proveedor;
import com.bonanza.back.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    public Usuario findByUsername(String username);

}
