package br.com.pismo.framework.configuration;

import org.mapstruct.MapperConfig;
import org.mapstruct.extensions.spring.SpringMapperConfig;

@MapperConfig(componentModel = "spring", uses = ConversionServiceAdapter.class)
@SpringMapperConfig(conversionServiceAdapterPackage = MapStructConfiguration.CONVERSION_SERVICE_ADAPTER_PACKAGE)
public interface MapStructConfiguration {

    String CONVERSION_SERVICE_ADAPTER_PACKAGE = "br.com.pismo.framework.configuration";

}
