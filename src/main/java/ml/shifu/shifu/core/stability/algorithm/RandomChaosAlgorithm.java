/*
 * Copyright [2013-2021] PayPal Software Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ml.shifu.shifu.core.stability.algorithm;

import ml.shifu.shifu.container.obj.ColumnConfig;

import java.util.Random;

/**
 * Generate random value for both category and numeric.
 *
 * @author Wu Devin (haifwu@paypal.com)
 */
public class RandomChaosAlgorithm extends BaseChaosAlgorithm {
    private static Random random = new Random(System.currentTimeMillis());

    @Override
    String generateCategoryChaosValue(String originValue, ColumnConfig config) {
        int cnt = config.getBinCategory().size();
        return config.getBinCategory().get(random.nextInt(cnt));
    }

    @Override
    String generateNumericChaosValue(String originValue, ColumnConfig config) {
        return String.valueOf(random.nextDouble());
    }
}
