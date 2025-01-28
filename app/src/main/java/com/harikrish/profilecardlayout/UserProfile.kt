package com.codingtroops.profilecardlayout

data class UserProfile constructor(val id: Int, val name: String, val status: Boolean, val pictureUrl: String, val bio: String)

val userProfileList = arrayListOf(
    UserProfile(
        id = 0,
        name = "Michaela Runnings",
        status = true,
        pictureUrl = "https://images.unsplash.com/photo-1485290334039-a3c69043e517?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=800&q=80",
        bio = "Hi, I’m Michaela! I’ve always believed in the power of balance, whether it’s between work and life or being creative and practical. I’ve found my niche in digital marketing, where I can combine my love for innovation with my ability to connect with people. Over the years, I’ve learned that challenges are just opportunities in disguise, and I thrive in environments where I can grow and learn. Outside of work, you’ll probably find me hiking through nature, diving into a self-improvement book, or volunteering for causes I care about. I'm passionate about helping others achieve their goals, just like I strive to achieve mine. Life is an adventure, and I try to make the most of every moment."
    ),
    UserProfile(
        id = 1,
        name = "John Pestridge",
        status = false,
        pictureUrl = "https://images.unsplash.com/photo-1542178243-bc20204b769f?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MTB8fHBvcnRyYWl0fGVufDB8MnwwfA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60",
        bio = "Hey, I’m John. I’ve been in the tech world for over a decade now, and it’s been an incredible journey. I specialize in software engineering, which means I spend most of my days solving problems and building things that people can use in their everyday lives. I’m a bit of an introvert, but I’ve learned to embrace that about myself. When I’m not coding or troubleshooting issues, you’ll find me behind a camera, capturing the beauty of the world around me, especially city landscapes. Photography has always been a passion of mine, and it allows me to express myself in a way that words sometimes can't. If you're looking for someone who is calm under pressure and passionate about tech, I’m your guy."
    ),
    UserProfile(
        id = 2,
        name = "Manilla Andrews",
        status = true,
        pictureUrl = "https://images.unsplash.com/photo-1543123820-ac4a5f77da38?ixid=MXwxMjA3fDB8MHxzZWFyY2h8NDh8fHBvcnRyYWl0fGVufDB8MnwwfA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60",
        bio = "Hi there, I’m Manilla! Creativity is at the core of everything I do. I’m a graphic designer by trade, and I absolutely love creating something beautiful out of nothing. Whether it’s a branding project for a startup or a massive ad campaign for a big company, I thrive on turning ideas into visual stories. Outside of design, I practice yoga every morning and spend my weekends painting or exploring new places. I’m a huge believer in the power of mindfulness, and it’s something I carry with me throughout my life. I also really care about sustainability, so I’m always on the lookout for eco-friendly alternatives to everyday products. If you're into creativity, mindfulness, and finding ways to make the world a better place, we’ll get along just fine!"
    ),
    UserProfile(
        id = 3,
        name = "Dan Spicer",
        status = false,
        pictureUrl = "https://images.unsplash.com/photo-1595152772835-219674b2a8a6?ixid=MXwxMjA3fDB8MHxzZWFyY2h8NDd8fHBvcnRyYWl0fGVufDB8MnwwfA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60",
        bio = "Hey, I’m Dan! I’m a problem-solver at heart, and that’s why I love my work as a finance consultant. There’s always a new challenge to tackle, and I enjoy finding the solutions that get results. My job keeps me sharp and always learning. Outside of work, I’m passionate about sports—whether I’m attending a live soccer match or playing tennis with friends, I love the thrill of competition. I’m also a huge tech geek and love building custom PCs. I’m the type of person who will help you fix your tech issues if you ask. Life is busy, but I make time for fun and friendships, and I’m always up for a good laugh with the people I care about."
    ),
    UserProfile(
        id = 4,
        name = "Keanu Dester",
        status = false,
        pictureUrl = "https://images.unsplash.com/photo-1597528380214-aa94bde3fc32?ixid=MXwxMjA3fDB8MHxzZWFyY2h8NTZ8fHBvcnRyYWl0fGVufDB8MnwwfA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60",
        bio = "Hey, I’m Keanu! I’ve always been driven by a desire to create and innovate. As an entrepreneur, I’ve founded several startups, each more exciting than the last. Building something from the ground up is incredibly rewarding, and I love the process of turning an idea into reality. Outside of work, I’m a huge foodie—I love experimenting with new recipes and trying out dishes from all over the world. I also travel a lot, not just for business, but to explore new cultures and gain fresh perspectives. If I’m not working or eating, I’m probably spending time with my friends and family, or catching up on the latest trends in tech. I’m all about finding a balance between work, creativity, and living life to the fullest."
    ),
    UserProfile(
        id = 5,
        name = "Anichu Patel",
        status = false,
        pictureUrl = "https://images.unsplash.com/photo-1598641795816-a84ac9eac40c?ixid=MXwxMjA3fDB8MHxzZWFyY2h8NjJ8fHBvcnRyYWl0fGVufDB8MnwwfA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60",
        bio = "Hello, I’m Anichu! I’m a healthcare professional with a deep passion for public health and community outreach. My goal is to make healthcare more accessible and create lasting impact in communities that need it the most. I’ve worked with NGOs to focus on preventive care and health education. When I’m not working, I love staying active—I’m a Pilates enthusiast and believe that maintaining my own health is key to helping others. I’m also a huge advocate for mental health awareness and work to raise awareness in every space I enter. I find peace in nature and enjoy hiking whenever I get the chance. If you’re into health, fitness, and giving back to the community, we’d get along great."
    ),
    UserProfile(
        id = 6,
        name = "Kienla Onso",
        status = true,
        pictureUrl = "https://images.unsplash.com/photo-1566895733044-d2bdda8b6234?ixid=MXwxMjA3fDB8MHxzZWFyY2h8ODh8fHBvcnRyYWl0fGVufDB8MnwwfA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60",
        bio = "Hi, I’m Kienla! My work in social justice and advocacy is what drives me every day. I’m passionate about empowering marginalized communities and working toward social change. I’ve had the privilege of working with various NGOs and governmental organizations to improve policies and provide better opportunities for everyone. I’m deeply committed to gender equality, and I frequently speak at events to raise awareness. When I’m not working on social projects, I love traveling and immersing myself in different cultures. I’m also a big fan of meditation and mindfulness. Helping others is at the core of who I am, and I’m always looking for ways to make a difference, no matter how small."
    ),
    UserProfile(
        id = 7,
        name = "Andra Matthews",
        status = false,
        pictureUrl = "https://images.unsplash.com/photo-1530577197743-7adf14294584?ixid=MXwxMjA3fDB8MHxzZWFyY2h8NTV8fHBvcnRyYWl0fGVufDB8MnwwfA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60",
        bio = "Hey, I’m Andra! Writing has always been my first love. As a journalist, I get to uncover stories and bring light to the issues that matter most. I specialize in literature and creative writing, and I feel so fortunate to be able to do something I’m truly passionate about. Outside of the newsroom, I’m often playing guitar or finding new ways to express myself through music. I also have a deep love for animals and spend a lot of time volunteering at shelters. I believe in the power of storytelling to create change, and that’s why I love what I do. If you’re into creativity, music, and social change, we’ll definitely vibe."
    ),
    UserProfile(
        id = 8,
        name = "Georgia S.",
        status = false,
        pictureUrl = "https://images.unsplash.com/photo-1547212371-eb5e6a4b590c?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MTA3fHxwb3J0cmFpdHxlbnwwfDJ8MHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60",
        bio = "Hi, I’m Georgia! I’m a communications expert with a passion for connecting people and brands in meaningful ways. For me, it’s all about building relationships that matter. I work in public relations and enjoy crafting messages that resonate with audiences. I’m an avid traveler, always seeking to learn more about different cultures and perspectives. When I’m not working, I love to explore new restaurants, try out different cuisines, and spend time with my friends and family. I believe in the power of positive communication to create real change in the world, and I’m always excited to be part of something impactful."
    ),
    UserProfile(
        id = 9,
        name = "Matt Dengo",
        status = false,
        pictureUrl = "https://images.unsplash.com/photo-1578176603894-57973e38890f?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MTE0fHxwb3J0cmFpdHxlbnwwfDJ8MHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60",
        bio = "Hello, I’m Matt! I’ve been a software developer for over five years now, and I still get excited about solving complex problems. I work with both front-end and back-end development, and I love the challenge of creating seamless user experiences. Outside of work, I’m a huge fan of gaming and tech gadgets. You can often find me building custom setups or tinkering with new tech. I also love to run and stay active—it’s my way of clearing my mind after a long day of coding. If you're a fellow tech enthusiast or gamer, let’s connect and talk about the latest trends!"
    ),
    UserProfile(
        id = 10,
        name = "Marsha T.",
        status = true,
        pictureUrl = "https://images.unsplash.com/photo-1605087880595-8cc6db61f3c6?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MTI0fHxwb3J0cmFpdHxlbnwwfDJ8MHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60",
        bio = "Hi, I’m Marsha! I’m a marketing strategist with a passion for understanding consumer behavior and crafting campaigns that make an impact. I’ve been in the marketing world for nearly a decade and love the ever-changing nature of the industry. When I’m not working on client projects, I enjoy reading, especially non-fiction books that help me grow both personally and professionally. I’m also into fitness, and I make time for a run or a yoga session every morning. Life is all about balance, and I believe in staying grounded while striving for success."
    ),
    UserProfile(
        id = 11,
        name = "Invshu Patel",
        status = true,
        pictureUrl = "https://images.unsplash.com/photo-1561820009-8bef03ebf8e5?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MTM3fHxwb3J0cmFpdHxlbnwwfDJ8MHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60",
        bio = "Hello, I’m Invshu! I’m a product manager, and I’m all about creating products that solve real problems. I work closely with cross-functional teams to ensure that what we build truly adds value to our users. My job is constantly evolving, and I enjoy being at the intersection of business, technology, and user experience. Outside of work, I’m passionate about sustainability and environmental issues. I’m also a foodie who loves to cook and experiment with new recipes. If you’re into tech, innovation, or sustainability, we’ll have a lot to talk about!"
    ),
    UserProfile(
        id = 12,
        name = "Braylen Nathan",
        status = true,
        pictureUrl = "https://images.unsplash.com/photo-1605857840732-188f2f08cb31?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MTQ5fHxwb3J0cmFpdHxlbnwwfDJ8MHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60",
        bio = "Hey, I’m Braylen! I’m a full-stack developer who loves tackling tough coding challenges. My job allows me to work with both the client-side and server-side of applications, and I find the problem-solving aspect of it thrilling. When I’m not coding, I enjoy getting outdoors. I’m a passionate hiker and love spending time in nature to recharge. I’m also into photography, capturing the beauty of the world around me through my lens. Whether it’s tech, hiking, or photography, I’m always looking for new ways to learn and grow."
    ),
    UserProfile(
        id = 13,
        name = "Jorge Andre",
        status = false,
        pictureUrl = "https://images.unsplash.com/photo-1517588632672-9758d6acba04?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MTYyfHxwb3J0cmFpdHxlbnwwfDJ8MHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60",
        bio = "Hey, I’m Jorge! I’m a civil engineer with a passion for urban development and sustainability. I work on large-scale construction projects that aim to make cities more efficient, environmentally friendly, and livable. Outside of work, I enjoy cycling and exploring new places. I believe in constantly improving my skills, whether it’s through reading, attending workshops, or simply spending time in nature. I’m also passionate about volunteering and giving back to my community, which helps me stay grounded and connected to what truly matters."
    ),
    UserProfile(
        id = 14,
        name = "Jamison Dana",
        status = false,
        pictureUrl = "https://images.unsplash.com/photo-1513690277738-c9bc7eb2a992?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MTY1fHxwb3J0cmFpdHxlbnwwfDJ8MHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60",
        bio = "Hey, I’m Jamison! I’m a creative director in the advertising world, and I’m constantly looking for new ways to communicate powerful ideas through visuals. Whether it’s a brand campaign or a digital project, I’m always striving to push boundaries and make an impact. Outside of work, I’m a big fan of the arts—I love going to the theater, visiting art galleries, and even doing some painting myself. I also love spending time with my family, whether we’re having a quiet evening at home or taking a trip somewhere new. Life is all about creativity and connection for me."
    ),
    UserProfile(
        id = 15,
        name = "Laura S.",
        status = true,
        pictureUrl = "https://images.unsplash.com/photo-1513708847802-f2fa846a7eaa?ixid=MXwxMjA3fDB8MHxzZWFyY2h8MTg1fHxwb3J0cmFpdHxlbnwwfDJ8MHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=500&q=60",
        bio = "Hi, I’m Laura! I’m a passionate advocate for education, and I work as a school counselor helping students achieve their full potential. I believe that every student deserves to feel supported and empowered to succeed. Outside of work, I’m an avid reader and enjoy diving into novels or educational books that help me grow. I also love spending time outdoors, especially hiking and kayaking. I’m a firm believer in lifelong learning, and I’m always looking for new ways to improve both personally and professionally."
    )
)