package com.wine.to.up.proxy_service.service;

import java.net.Proxy;
import java.util.List;

public interface ProxyValidatorService {

    List<Proxy> validateProxy(List<Proxy> proxyList);

    List<Proxy> validateProxy(List<Proxy> proxyList, String url);
}
