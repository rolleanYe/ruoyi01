<template>
  <div class="app-container">
    <el-form  ref="queryForm" :model="queryForm"  label-width="68px">
      <el-form-item label="时间">
        <el-date-picker
          v-model="queryForm.dateRangeExt"
          size="small"
          style="width: 240px"
          value-format="yyyy-MM-dd"
          type="daterange"
          range-separator="-"
          start-placeholder="开始日期"
          end-placeholder="结束日期"
        />
      </el-form-item>
      <el-form-item>
        <el-button type="cyan" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

  </div>
</template>

<script>
  export default {
    name: "Performance",
    data(){
      return{
        queryForm:{
          dateRangeExt: [],
        },
      };
    },
    methods:{
      handleQuery(){
        alert('1231231');
      },
      resetQuery() {
        this.queryForm.dateRangeExt = [];
        this.resetForm("queryForm");

      },
    }
  }
</script>
