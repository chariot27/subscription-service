package br.ars.subscription_service.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.ars.subscription_service.dto.AssinaturaDTO;
import br.ars.subscription_service.models.Assinatura;

@Mapper(componentModel = "spring")
public interface AssinaturaMapper {

    @Mapping(source = "plano.id", target = "planoId")
    AssinaturaDTO toDTO(Assinatura assinatura);

    @Mapping(source = "planoId", target = "plano.id")
    Assinatura toEntity(AssinaturaDTO dto);
}
