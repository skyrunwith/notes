一、Keep it simple stupid(kiss)
	less inheritance(少继承)、less polymorphism(少多态)、fewer classes(少class)
	Contrary Priciples：相反的原则
		Generalization Principle (GP)通用原则: 适用的方案不再simple
		Murphy's Law (ML)墨菲定律: kiss的目的是提高可维护性和减少缺陷。在不考虑ML(墨菲定律)的情况下，始终使用kiss也会降低可维护性
		Model Principle (MP)模型原则：模型原则会拥有更多的对象和负责的结构
	总结：人类开发人员必须决定要实施的解决方案，而这些原则仅给出指导。Make everything as simple as possible, but not simpler
二、YAGNI:You’re NOT gonna need it! 你不会需要它
	总是实现需要的，而不是强制需要它。https://ronjeffries.com/xprog/articles/practices/pracnotneed/
	why: 
		a.当我们在思考可能是什么，而不是思考必须是什么的时候，已经偏离了实际的轨道。我们应该专心完成任务而不应该分心。
		b.我们的时间很宝贵(precious), 磨练我们的进度意识，专注开发实际任务()real task)，而不仅仅是敲代码banging out code。
		c.You might not need it after all(毕竟你可能不需要它)。如果发生这种事情，花在实现方法的时间就被浪费了，其他人花在阅读上的时间也被浪费了。the space it takes up will be wasted。
		d.它会引起代码膨胀，软件会变得更大和更复杂
	how:
		The best way to implement code quickly is to implement less of it. The best way to have fewer bugs is to implement less code.
三、Do The Simplest Thing That Could Possibly Work
	Why:
		如果我们仅解决问题的实质,那么最大程度的提高了解决实际问题的能力.
	How:
		Ask yourself: What is the simplest thing that could possibly work.
四、Sepration of concerns 关注点分离
	why：
		简化应用开发和维护。
		当关注点分离后，各个部分能够被重用，也可以独立开发和更新。
	How：
		将程序功能分成尽可能小的模块.