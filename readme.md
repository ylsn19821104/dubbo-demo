一个dubbo的服务提供与发现的最简demo，基于maven构建的多模块项目

note：服务提供与发现双方公用的接口最好抽出来，放到一个单独的模块，或者单独写个项目，然后打包接口为jar包。如果自己在服务提供方和发现方都手写一遍接口，也不是不可以，但一定要注意两个接口不仅定义要保持一致，而且包名要保持一致。而一般不同模块包名都有差别，所以极易导致包名不一致，而包名不一致也会导致找不到可用的服务提供方