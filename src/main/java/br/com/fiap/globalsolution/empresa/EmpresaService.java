package br.com.fiap.globalsolution.empresa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpresaService {

    @Autowired
    private EmpresaRepository empresaRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void cadastrarEmpresa(Empresa empresa) {
        empresa.setSenha(passwordEncoder.encode(empresa.getSenha()));
        empresaRepository.save(empresa);
    }

    public Empresa getEmpresa(Long empresaId) {
        return empresaRepository.findById(empresaId).orElse(null);
    }

    public Long obterEmpresaIdPeloEmail(String email) {
        Optional<Empresa> empresaOptional = empresaRepository.findByEmail(email);
        return empresaOptional.map(Empresa::getId).orElse(null);
    }
}
