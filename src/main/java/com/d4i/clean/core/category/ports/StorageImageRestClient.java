package com.d4i.clean.core.category.ports;

import com.d4i.clean.core.category.usecase.StorageImage;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@FeignClient(name="filmClient", url= "http://storage-image/film-info/film/")
public interface StorageImageRestClient{

    @RequestMapping(method = RequestMethod.GET, value = "{id}", produces = "application/json")
    StorageImage findById(@PathVariable("id")final Long id);

}
