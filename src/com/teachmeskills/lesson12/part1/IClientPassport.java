package com.teachmeskills.lesson12.part1;

import java.util.HashMap;
import java.util.Map;

/**
 * interface with the Map collection for storing customer passport numbers as a key
 */
public interface IClientPassport {
    Map<String, ClientDescription> clientPassport = new HashMap<>();
}
