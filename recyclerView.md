How to convert a list to View
1. Collect your data which you wanted to see as a list. For ex: one list consist of an image and a Title
2. So you have to collect your all images and strings you want to see. (Images are put into Drawable Folder and strings are put into value folde in STRING File )
3. Create an adapter (it is class actually : has an adaption power) 
    it has following contents
    1. Constructor of adapter (Here we collect the data and image and CONTEXT[it's special, without context adapter become fail]  ) [it just received the data from where it called,All data are to be used future when we bind the datas]
    2. A onCreateViewHolder (Generated.....)[in this section it collect just one item From the layout 
    Defenately you have to created first a sample layout. Actually this sample layout to be collected. After inflating this layout you need to transfer into the view. Return this view to the own created_view.
    ]
    3. A own viewHolder ---you have to create it.[For the use in onBindVeiwHolder we collect the all primitives data from the unit of a view]
    4. A onBindViewHolder(Generated....)[Bind the data by their position from the viewHolder and constructor]
    5. getCount (Generated....  )[ How many elements you want to display]   