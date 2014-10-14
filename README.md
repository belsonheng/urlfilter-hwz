urlfilter-hwz
=============

Nutch's URLFilter plugin for hwz forum.

Getting Started
-------------

1. Clone this repository into your Nutch's plugin directory src/plugin
2. Modify src/plugin/build.xml to include urlfilter-hwz as deploy and clean targets respectively for compilation

        <ant dir="urlfilter-hwz" target="deploy"/>
        ...
        <ant dir="urlfilter-hwz" target="clean"/>

3. Modify conf/nutch-site.xml to include urlfilter-hwz plugin

         <property>
          <name>plugin.includes</name>
          <value>urlfilter-hwz|parse-(html|tika)|urlnormalizer-(pass|regex|basic)</value>
         </property>
