package com.github.majora_incarnate.mwo_mechbay.parser;

import com.github.majora_incarnate.mwo_mechbay.entities.WeaponBlueprint;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Trevin
 */
public class Transformer {
    private final ArrayList<String> files;

    public Transformer(final String... fileStreams) {
        files = new ArrayList<>(Arrays.asList(fileStreams));
    }

    public WeaponBlueprint[] transform() {
        final WeaponBlueprint[] blueprints = new WeaponBlueprint[files.size()];

        for (int i = 0; i < files.size(); i++) {
            //blueprints[i] = new WeaponBlueprint(files.get(i));
        }

        return blueprints;
    }
}
